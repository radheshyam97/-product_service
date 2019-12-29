package com.radhe.product.controller;

import java.util.HashMap;
import java.util.Map;

import com.radhe.product.controller.Controller;
import com.radhe.product.logger.AppLogger;

public class ControllerRepository {

	private static AppLogger log = AppLogger.getLogger(ControllerRepository.class);
	private static Map<String, Controller> controllerMap = new HashMap<>();

	public void registerController(String uriKey, Controller controller) {
		controllerMap.put(uriKey.trim(), controller);
	}

	public Controller getController(String uriKey) {
		return controllerMap.get(uriKey.trim());

	}

	public static void logControlleres() {

		log.info("controllerMap: " + controllerMap);
	}

}
