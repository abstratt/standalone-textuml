package com.abstratt.kirra.mdd.cli.standalone;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import com.abstratt.mdd.frontend.cli.standalone.EMFHelper;
import com.abstratt.standalone.StandaloneRegistryLoader;

public class StandaloneKirraMDDCLI {
	public static void main(String[] args) throws CoreException, IOException, URISyntaxException {
		ClassLoader classLoader = StandaloneKirraMDDCLI.class.getClassLoader();
		StandaloneRegistryLoader.build(classLoader);
		EcorePlugin.ExtensionProcessor.process(null);
		registerURIMapping("pathmap://MDD_LIBRARIES/", "models/", "libraries/base.uml", classLoader);
		registerURIMapping("pathmap://MDD_LIBRARIES/", "models/", "libraries/mdd_types.uml", classLoader);
		registerURIMapping("pathmap://MDD_LIBRARIES/", "models/", "libraries/mdd_collections.uml", classLoader);
		registerURIMapping("pathmap://MDD_LIBRARIES/", "models/", "libraries/mdd_media.uml", classLoader);		
		registerURIMapping("pathmap://MDD_PROFILES/", "models/", "profiles/mdd_extensions.uml", classLoader);		
		UMLResourcesUtil.initGlobalRegistries();
		URIConverter.URI_MAP.forEach((key, value) -> System.out.println(MessageFormat.format("\t{0} -> \t{1}", key, value)));
	}
	
	public static void registerURIMapping(String uriPrefix, String resourcePrefix, String sampleResourcePath, ClassLoader classLoader) throws CoreException, URISyntaxException {
		EMFHelper.registerURIMapping(uriPrefix, resourcePrefix, sampleResourcePath, classLoader);
	}

}
