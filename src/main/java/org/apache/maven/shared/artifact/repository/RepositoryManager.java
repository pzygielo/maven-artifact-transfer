package org.apache.maven.shared.artifact.repository;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.project.ProjectBuildingRequest;
import org.apache.maven.shared.artifact.install.ArtifactInstallerException;

public interface RepositoryManager
{

    String getPathForLocalArtifact( ProjectBuildingRequest buildingRequest, Artifact artifact );
    
    /**
     * Create a new {@code ProjectBuildingRequest} with an adjusted repository session. 
     * 
     * @param request the project building request
     * @param basedir the base directory of the local repository
     * @return a new project building request
     */
    public ProjectBuildingRequest setLocalRepositoryBasedir( ProjectBuildingRequest request, File basedir );
    
    /**
     * Get the localRepositryBasedir as specified in the repository session of the request
     * 
     * @param request the build request
     * @return the local repository base directory
     */
    public File getLocalRepositoryBasedir( ProjectBuildingRequest request );
}