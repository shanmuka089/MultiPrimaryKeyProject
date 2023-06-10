//package com.example.demo.rest.controller;
//
//import java.util.List;
//
//import com.fasterxml.jackson.databind.BeanDescription;
//import com.fasterxml.jackson.databind.SerializationConfig;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
//import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
//
//public class HibernateLazyInitializerModule extends SimpleModule {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	public HibernateLazyInitializerModule() {
//		setSerializerModifier(new BeanSerializerModifier() {
//			@Override
//			public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc,
//					List<BeanPropertyWriter> beanProperties) {
//
//				for (BeanPropertyWriter writer : beanProperties) {
//					if (writer.getName().equals("hibernateLazyInitializer")) {
//						beanProperties.remove(writer);
//						break;
//					}
//				}
//				return beanProperties;
//			}
//		});
//	}
//}
