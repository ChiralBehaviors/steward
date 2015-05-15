/**
 * Copyright (c) 2015 Chiral Behaviors, LLC, all rights reserved.
 * 
 
 * This file is part of Ultrastructure.
 *
 *  Ultrastructure is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  ULtrastructure is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Ultrastructure.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.chiralbehaviors.northwind.products;

import com.chiralbehaviors.CoRE.phantasm.Phantasm;
import com.chiralbehaviors.CoRE.product.Product;
import com.chiralbehaviors.annotations.State;

/**
 * @author hhildebrand
 *
 */
@State(workspace = "uri:http://ultrastructure.me/ontology/com.chiralbehaviors/demo/northwind/v1")
public interface OrderItem extends Phantasm<Product> {

}