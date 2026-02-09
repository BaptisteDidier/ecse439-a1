/**
 */
package cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planned Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.PlannedSession#getTermOrder <em>Term Order</em>}</li>
 *   <li>{@link cps.PlannedSession#getSemester <em>Semester</em>}</li>
 *   <li>{@link cps.PlannedSession#getProposedCourses <em>Proposed Courses</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getPlannedSession()
 * @model
 * @generated
 */
public interface PlannedSession extends EObject {
	/**
	 * Returns the value of the '<em><b>Term Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Order</em>' attribute.
	 * @see #setTermOrder(int)
	 * @see cps.CpsPackage#getPlannedSession_TermOrder()
	 * @model
	 * @generated
	 */
	int getTermOrder();

	/**
	 * Sets the value of the '{@link cps.PlannedSession#getTermOrder <em>Term Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Order</em>' attribute.
	 * @see #getTermOrder()
	 * @generated
	 */
	void setTermOrder(int value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' attribute.
	 * The literals are from the enumeration {@link cps.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' attribute.
	 * @see cps.Semester
	 * @see #setSemester(Semester)
	 * @see cps.CpsPackage#getPlannedSession_Semester()
	 * @model
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link cps.PlannedSession#getSemester <em>Semester</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' attribute.
	 * @see cps.Semester
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Proposed Courses</b></em>' reference list.
	 * The list contents are of type {@link cps.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Courses</em>' reference list.
	 * @see cps.CpsPackage#getPlannedSession_ProposedCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getProposedCourses();

} // PlannedSession
