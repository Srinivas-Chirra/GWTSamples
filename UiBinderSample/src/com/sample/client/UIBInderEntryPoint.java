package com.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class UIBInderEntryPoint implements EntryPoint {
	
	RegistrationForm form = new RegistrationForm();

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(form);
	}

}
