/**
 */
package cps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cps.Course#getCode <em>Code</em>}</li>
 *   <li>{@link cps.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link cps.Course#getOffered <em>Offered</em>}</li>
 *   <li>{@link cps.Course#getYear <em>Year</em>}</li>
 *   <li>{@link cps.Course#getPrereq <em>Prereq</em>}</li>
 *   <li>{@link cps.Course#getCoreq <em>Coreq</em>}</li>
 * </ul>
 *
 * @see cps.CpsPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see cps.CpsPackage#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link cps.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see cps.CpsPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link cps.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Offered</b></em>' attribute.
	 * The literals are from the enumeration {@link cps.Term}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered</em>' attribute.
	 * @see cps.Term
	 * @see #setOffered(Term)
	 * @see cps.CpsPackage#getCourse_Offered()
	 * @model
	 * @generated
	 */
	Term getOffered();

	/**
	 * Sets the value of the '{@link cps.Course#getOffered <em>Offered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offered</em>' attribute.
	 * @see cps.Term
	 * @see #getOffered()
	 * @generated
	 */
	void setOffered(Term value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see cps.CpsPackage#getCourse_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link cps.Course#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Prereq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prereq</em>' containment reference.
	 * @see #setPrereq(Expr)
	 * @see cps.CpsPackage#getCourse_Prereq()
	 * @model containment="true"
	 * @generated
	 */
	Expr getPrereq();

	/**
	 * Sets the value of the '{@link cps.Course#getPrereq <em>Prereq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prereq</em>' containment reference.
	 * @see #getPrereq()
	 * @generated
	 */
	void setPrereq(Expr value);

	/**
	 * Returns the value of the '<em><b>Coreq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coreq</em>' containment reference.
	 * @see #setCoreq(Expr)
	 * @see cps.CpsPackage#getCourse_Coreq()
	 * @model containment="true"
	 * @generated
	 */
	Expr getCoreq();

	/**
	 * Sets the value of the '{@link cps.Course#getCoreq <em>Coreq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coreq</em>' containment reference.
	 * @see #getCoreq()
	 * @generated
	 */
	void setCoreq(Expr value);

} // Course
