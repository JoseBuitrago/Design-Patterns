package ingsw.pdd.chainofresponsability.validator;

import ingsw.pdd.chainofresponsability.domain.order.AbstractOrder;
import ingsw.pdd.chainofresponsability.domain.order.SalesOrder;

public class SalesOrderValidator extends AbstractOrderValidator {

   
    public void validate(AbstractOrder order) throws ValidationException {
        if (!(order instanceof SalesOrder)) {
            throw new ValidationException("Se esperaba una orden de Venta");
        }

        for(AbstractOrderValidator validator : validators){
            validator.validate(order);
        }
    }
}
