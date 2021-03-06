/*******************************************************************************
 * Copyright (c) 2012 EclipseSource and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    EclipseSource - initial API and implementation
 ******************************************************************************/
package com.eclipsesource.tabris.demos;

import org.eclipse.rap.rwt.branding.AbstractBranding;


public class Branding extends AbstractBranding {
  
  private final String id;
  private String themeId;

  public Branding( String id ) {
    this.id = id;
  }
  
  public Branding( String id, String themeId ) {
    this( id );
    this.themeId = themeId;
  }
  
  @Override
  public String getDefaultEntryPoint() {
    return id;
  }
  
  @Override
  public String getThemeId() {
    String result = "org.eclipse.rap.rwt.theme.Default";
    if( themeId != null ) {
      result = themeId;
    }
    return result;
  }
  
  @Override
  public String getServletName() {
    return id;
  }
}
