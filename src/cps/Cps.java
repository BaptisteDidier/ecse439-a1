/**
 */
package cps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.Cps#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getCps()
 * @model
 * @generated
 */
public interface Cps extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(Program)
	 * @see cps.CpsPackage#getCps_Program()
	 * @model containment="true"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link cps.Cps#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // Cps
