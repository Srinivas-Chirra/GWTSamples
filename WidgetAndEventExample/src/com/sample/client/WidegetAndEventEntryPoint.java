package com.sample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import static com.google.gwt.user.client.ui.RootPanel.*;

import java.util.Date;

import com.google.gwt.user.datepicker.client.DatePicker;

public class WidegetAndEventEntryPoint implements EntryPoint {
	
	Button button = new Button("Clike Here");
	
	
	Label label = new Label("Calender: ");
	
	DatePicker datepicker= new DatePicker();
	
	

	@Override
	public void onModuleLoad() {
		get().add(button);
		button.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Hello Learner! Welcome");
				
			}
		});
		
		datepicker.addValueChangeHandler(new ValueChangeHandler<Date>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<Date> event) {
				Window.alert(event.getValue().toString());
				
			}
		});
		get().add(label);
		get().add(datepicker);
	}

}
