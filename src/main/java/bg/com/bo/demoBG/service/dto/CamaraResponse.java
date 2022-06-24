package bg.com.bo.demoBG.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CamaraResponse extends Response{
    private Integer codigo;
    private String descripcion;
}
