package uz.pdp.apppcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.apppcmarket.entity.DiliveryAndPay;


@Projection(types = DiliveryAndPay.class)
public interface CustomDiliveryAndPay {
    Integer getId();
    String getFullName();
    String getEmail();
}
