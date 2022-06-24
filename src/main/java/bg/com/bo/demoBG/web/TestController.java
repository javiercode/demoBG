package bg.com.bo.demoBG.web;

import javax.validation.Valid;

import bg.com.bo.demoBG.service.dto.CamaraResponse;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bg.com.bo.demoBG.domain.AchCamaras;
import bg.com.bo.demoBG.service.ACHService;


@RestController
//@RequestMapping("/jwt/")
@MapperScan("bg.com.bo.demoBG.dao")
public class TestController {

    @Autowired
	private ACHService achServicio;

    @GetMapping("/test")
    public ResponseEntity<String> test(){
    	AchCamaras c=achServicio.getCamaraACH();
    	System.out.println(c.getDescripcion());
        return new ResponseEntity<String>("Hola mundo!!"+c.getDescripcion(), HttpStatus.OK);
    }

    @GetMapping("/camara")
    public ResponseEntity<CamaraResponse> Camara(){
        CamaraResponse response = new CamaraResponse();
        AchCamaras c=achServicio.getCamaraACH();
        response.setDescripcion(c.getDescripcion());
        response.setCodigo(c.getCodigo());
        return new ResponseEntity<CamaraResponse>(response, HttpStatus.OK);
    }
    
	/*@PostMapping(value = "/getconexion", consumes = "application/json")
	//@RequiresAuthentication
    public AchCamaras get(@RequestBody @Valid Usuarios usuInfo) {
		String apodo = usuInfo.getApodo();
		String clave = usuInfo.getClave();
		return Servicio.getConexion(apodo,clave);
    }*/
}
