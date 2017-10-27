/**
 * generated by Xtext 2.12.0
 */
package com.hribol.bromium.dsl.bromium;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ParameterValue#getContent <em>Content</em>}</li>
 *   <li>{@link com.hribol.bromium.dsl.bromium.ParameterValue#getExposedParameter <em>Exposed Parameter</em>}</li>
 * </ul>
 *
 * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getParameterValue()
 * @model
 * @generated
 */
public interface ParameterValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getParameterValue_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ParameterValue#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

  /**
   * Returns the value of the '<em><b>Exposed Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exposed Parameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exposed Parameter</em>' reference.
   * @see #setExposedParameter(ExposedParameter)
   * @see com.hribol.bromium.dsl.bromium.BromiumPackage#getParameterValue_ExposedParameter()
   * @model
   * @generated
   */
  ExposedParameter getExposedParameter();

  /**
   * Sets the value of the '{@link com.hribol.bromium.dsl.bromium.ParameterValue#getExposedParameter <em>Exposed Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exposed Parameter</em>' reference.
   * @see #getExposedParameter()
   * @generated
   */
  void setExposedParameter(ExposedParameter value);

} // ParameterValue