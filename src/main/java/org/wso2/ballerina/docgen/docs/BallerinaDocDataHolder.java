/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.ballerina.docgen.docs;

import org.wso2.ballerina.docgen.docs.model.BallerinaPackageDoc;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds ballerina doc generation data
 */
public class BallerinaDocDataHolder {

    private static final BallerinaDocDataHolder instance = new BallerinaDocDataHolder();

    public static BallerinaDocDataHolder getInstance() {
        return instance;
    }
    /**
     * Key - package name
     * Value - {@link BallerinaPackageDoc}
     */
    private Map<String, BallerinaPackageDoc> ballerinaPackageDocsMap;

    protected BallerinaDocDataHolder() {
        ballerinaPackageDocsMap = new HashMap<String, BallerinaPackageDoc>();
    }

    public Map<String, BallerinaPackageDoc> getBallerinaPackageDocsMap() {
        return ballerinaPackageDocsMap;
    }

    public void setBallerinaPackageDocsMap(Map<String, BallerinaPackageDoc> ballerinaPackageDocsMap) {
        this.ballerinaPackageDocsMap = ballerinaPackageDocsMap;
    }
}