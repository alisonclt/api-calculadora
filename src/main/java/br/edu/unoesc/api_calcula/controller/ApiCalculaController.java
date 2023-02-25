package br.edu.unoesc.api_calcula.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unoesc.api_calcula.conversor.ConversorNumerico;
import br.edu.unoesc.api_calcula.service.Calculadora;

@RestController
@RequestMapping("/api/calcula")
public class ApiCalculaController {
	
	private Logger logger = Logger.getLogger(ApiCalculaController.class.getName());
	
	@GetMapping("/raiz-query")
    public Double raizQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.raiz(numero1, numero2);
    }
	
	@GetMapping("/potencia-query")
    public Double potenciaQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.potencia(numero1, numero2);
    }	
	
	@GetMapping("/media-query")
    public Double mediaQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
		return Calculadora.media(numero1, numero2);
    }
	
    @GetMapping("/somar-query")
    public Double somarQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
    	return Calculadora.soma(numero1, numero2);
    }
    
    @GetMapping("/subtracao-query")
    public Double subtracaoQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
    	return Calculadora.subtracao(numero1, numero2);
    }
    
    @GetMapping("/dividir-query")
    public Double dividirQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
    	return Calculadora.dividir(numero1, numero2);
    }
    
    @GetMapping("/multiplicar-query")
    public Double multiplicarQuery(@RequestParam(value = "numero1", defaultValue = "0") Double numero1, @RequestParam(value = "numero2", defaultValue = "0") Double numero2) {
    	return Calculadora.multiplicar(numero1, numero2);
    }
    
    @RequestMapping(value = "/raiz-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double raizPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	Double a = 0.0;
    	
    	try {
    		a = Calculadora.raiz(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	} catch (Exception e) {
			e.getMessage();
		}
    	
    	return a;
    }
    
    @RequestMapping(value = "/potencia-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double potenciaPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	Double a = Calculadora.potencia(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	
    	return a;
    }
    
    @RequestMapping(value = "/media-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double mediaPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	Double media = Calculadora.media(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	return media;
    }
    
    @RequestMapping(value = "/dividir-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double dividirPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	Double dividir = Calculadora.dividir(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	
    	return dividir;
    }
    
    @RequestMapping(value = "/somar-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double somarPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	Double soma = Calculadora.soma(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	
    	return soma;
    }
    
    @RequestMapping(value = "/multiplicar-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double multiplicarPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	Double multiplicar = Calculadora.multiplicar(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	
    	return multiplicar;
    }
    
    @RequestMapping(value = "/subtracao-path/{numero1}/{numero2}", method = RequestMethod.GET)
    public Double subtracaoPath(@PathVariable("numero1") String numero1, @PathVariable(value = "numero2") String numero2) {
    	logger.info("Calculando... " + numero1 + " + " + numero2);
    	
    	if (!ConversorNumerico.ehNumerico(numero1) || !ConversorNumerico.ehNumerico(numero2)) {
    		return 0d;
    	}
    	
    	Double subtrair = Calculadora.subtracao(ConversorNumerico.converterParaDouble(numero1), ConversorNumerico.converterParaDouble(numero2));
    	
    	return subtrair;
    }

}