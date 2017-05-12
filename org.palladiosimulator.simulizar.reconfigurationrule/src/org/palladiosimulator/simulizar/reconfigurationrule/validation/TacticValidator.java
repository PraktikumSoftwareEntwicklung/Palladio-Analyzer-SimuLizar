/**
 *
 * $Id$
 */
package org.palladiosimulator.simulizar.reconfigurationrule.validation;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.simulizar.reconfigurationrule.ModelTransformation;

/**
 * A sample validator interface for {@link org.palladiosimulator.simulizar.reconfigurationrule.Tactic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TacticValidator {
	boolean validate();

	boolean validatePriority(int value);
	boolean validateCondition(EList<ModelTransformation<?>> value);
	boolean validateAction(EList<ModelTransformation<?>> value);
}