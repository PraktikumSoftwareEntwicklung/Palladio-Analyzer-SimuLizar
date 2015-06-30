/**
 */
package violations;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjective;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Violation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link violations.ViolationType#getDescription <em>Description</em>}</li>
 *   <li>{@link violations.ViolationType#getSlo <em>Slo</em>}</li>
 * </ul>
 *
 * @see violations.ViolationsPackage#getViolationType()
 * @model
 * @generated
 */
public interface ViolationType extends EObject, org.palladiosimulator.pcm.core.entity.Entity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see violations.ViolationsPackage#getViolationType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link violations.ViolationType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo</em>' reference.
	 * @see #setSlo(ServiceLevelObjective)
	 * @see violations.ViolationsPackage#getViolationType_Slo()
	 * @model required="true"
	 * @generated
	 */
	ServiceLevelObjective getSlo();

	/**
	 * Sets the value of the '{@link violations.ViolationType#getSlo <em>Slo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo</em>' reference.
	 * @see #getSlo()
	 * @generated
	 */
	void setSlo(ServiceLevelObjective value);

} // ViolationType