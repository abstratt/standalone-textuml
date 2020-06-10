package com.abstratt.mdd.frontend.cli.standalone;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.URIConverter;

import com.abstratt.mdd.core.util.MDDUtil;

public class EMFHelper {
	public static URI registerURIMapping(String uriPrefix, String resourcePrefix, String sampleResourcePath, ClassLoader classLoader) throws CoreException, URISyntaxException {
		URL standaloneLocation = classLoader.getResource(resourcePrefix + sampleResourcePath);
		if (standaloneLocation == null) {
			return null;
		}
		java.net.URI mappedLocation = java.net.URI.create(uriPrefix).resolve(sampleResourcePath);
		URIConverter.URI_MAP.put(MDDUtil.fromJavaToEMF(mappedLocation), MDDUtil.fromJavaToEMF(standaloneLocation.toURI()));
		return standaloneLocation.toURI();
	}
}
