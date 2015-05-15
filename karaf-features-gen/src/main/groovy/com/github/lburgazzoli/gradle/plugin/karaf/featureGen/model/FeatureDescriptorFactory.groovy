/*
 * Copyright (c) 2015, contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lburgazzoli.gradle.plugin.karaf.featureGen.model

import org.gradle.api.NamedDomainObjectFactory
import org.gradle.api.Project

import com.github.lburgazzoli.gradle.plugin.karaf.featureGen.KarafFeaturesGenTaskExtension

/**
 * @author Steve Ebersole
 */
class FeatureDescriptorFactory implements NamedDomainObjectFactory<FeatureDescriptor>  {
	private final Project project;
	private final KarafFeaturesGenTaskExtension extension

	FeatureDescriptorFactory(Project project, KarafFeaturesGenTaskExtension extension) {
		this.extension = extension
		this.project = project
	}

	@Override
	FeatureDescriptor create(String name) {
		return new FeatureDescriptor( name, project, extension )
	}
}
