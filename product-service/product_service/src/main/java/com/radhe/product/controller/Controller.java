package com.radhe.product.controller;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

import com.radhe.product.model.ResponseVO;

public interface Controller {
	public ResponseVO processRequest(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext context);

}
