package com.akjava.gwt.three.client.math;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class SplineLength extends JavaScriptObject {
	protected SplineLength() {
	}

	public final native double totalLength ()/*-{
	return this.totalLength;
	}-*/;
	
	public final native JsArrayNumber chunks ()/*-{
	return this.totalLength;
	}-*/;
	
}