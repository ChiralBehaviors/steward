/**
 * Copyright (c) 2015 Chiral Behaviors, LLC, all rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chiralbehaviors.steward.workspace;

import org.junit.BeforeClass;

import com.chiralbehaviors.CoRE.meta.models.AbstractModelTest;
import com.chiralbehaviors.CoRE.meta.workspace.dsl.WorkspaceImporter;

/**
 * @author hparry
 *
 */
public abstract class AbstractStewardTest extends AbstractModelTest {

    @BeforeClass
    public static void before() throws Exception {
        em.getTransaction().begin();
        WorkspaceImporter.createWorkspace(AbstractStewardTest.class.getResourceAsStream("/steward-workspace.wsp"),
                                          model);
        em.getTransaction().commit();
        em.getTransaction().begin();
        WorkspaceImporter.createWorkspace(AbstractStewardTest.class.getResourceAsStream("/steward-scenario.wsp"),
                                          model);
        em.getTransaction().commit();
    }

}
