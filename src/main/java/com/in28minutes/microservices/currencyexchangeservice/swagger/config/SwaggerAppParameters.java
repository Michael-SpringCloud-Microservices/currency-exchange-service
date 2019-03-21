/**
 * 
 */
package com.in28minutes.microservices.currencyexchangeservice.swagger.config;


import springfox.documentation.service.Parameter;

import java.util.List;
/**
 * @author 109726
 *
 */
public interface SwaggerAppParameters {

    List<Parameter> globalOperationParameters();
}