/**
 */
package cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.Student#getName <em>Name</em>}</li>
 *   <li>{@link cps.Student#getTaken <em>Taken</em>}</li>
 *   <li>{@link cps.Student#getMaxCredits <em>Max Credits</em>}</li>
 *   <li>{@link cps.Student#getPlannedSessions <em>Planned Sessions</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cps.CpsPackage#getStudent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cps.Student#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Taken</b></em>' containment reference list.
	 * The list contents are of type {@link cps.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taken</em>' containment reference list.
	 * @see cps.CpsPackage#getStudent_Taken()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getTaken();

	/**
	 * Returns the value of the '<em><b>Max Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Credits</em>' attribute.
	 * @see #setMaxCredits(int)
	 * @see cps.CpsPackage#getStudent_MaxCredits()
	 * @model
	 * @generated
	 */
	int getMaxCredits();

	/**
	 * Sets the value of the '{@link cps.Student#getMaxCredits <em>Max Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Credits</em>' attribute.
	 * @see #getMaxCredits()
	 * @generated
	 */
	void setMaxCredits(int value);

	/**
	 * Returns the value of the '<em><b>Planned Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link cps.PlannedSession}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Sessions</em>' containment reference list.
	 * @see cps.CpsPackage#getStudent_PlannedSessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlannedSession> getPlannedSessions();

} // Student
