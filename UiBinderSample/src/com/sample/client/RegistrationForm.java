package com.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RegistrationForm extends Composite {

	private static RegistrationFormUiBinder uiBinder = GWT.create(RegistrationFormUiBinder.class);

	interface RegistrationFormUiBinder extends UiBinder<Widget, RegistrationForm> {
	}

	public RegistrationForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
