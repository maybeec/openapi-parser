/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.networknt.oas.validator;

import com.networknt.oas.jsonoverlay.ObjectOverlay;

public class AnyObjectValidator extends OverlayValidator<ObjectOverlay> {

    @Override
    public void validate(ObjectOverlay overlay, ValidationResults results) {
        super.validate(overlay, results);
    }

}
