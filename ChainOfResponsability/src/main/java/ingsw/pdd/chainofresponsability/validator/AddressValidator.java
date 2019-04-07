package ingsw.pdd.chainofresponsability.validator;

import ingsw.pdd.chainofresponsability.domain.Address;
import ingsw.pdd.chainofresponsability.domain.order.AbstractOrder;

public class AddressValidator extends AbstractOrderValidator{


    public void validate(AbstractOrder order) throws ValidationException{
        Address address = order.getContributor().getAddress();
        if(address.getAddress1()==null || address.getAddress1().length()==0){
            throw new ValidationException("La dirección 1 es obligatoria");
        }else if(address.getCP()==null || address.getCP().length()!=4){
            throw new ValidationException("El CP debe de ser de 4 dígitos");
        }else if(address.getCountry()==null || address.getCountry().length()==0){
            throw new ValidationException("El país es obligatorio");
        }
    }
}
