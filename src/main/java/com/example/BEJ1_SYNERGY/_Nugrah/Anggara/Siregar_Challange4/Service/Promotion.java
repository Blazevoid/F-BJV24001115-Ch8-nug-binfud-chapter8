package com.example.BEJ1_SYNERGY._Nugrah.Anggara.Siregar_Challange4.Service;

import com.example.BEJ1_SYNERGY._Nugrah.Anggara.Siregar_Challange4.FCM.FcmService;
import com.example.BEJ1_SYNERGY._Nugrah.Anggara.Siregar_Challange4.Model.Notification.NotificationRequest;
import com.example.BEJ1_SYNERGY._Nugrah.Anggara.Siregar_Challange4.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class Promotion {

    @Autowired
    ProductService productService;

    @Autowired
    FcmService fcmService;

    @Scheduled(cron = "0 * * * * *")
    public void cronJob() throws ExecutionException,InterruptedException{
        List<Product> productPromoList = productService.getAll();
        NotificationRequest request = new NotificationRequest();
        request.setTitle("Promo Siang Binarfud");
        request.setBody("Silakan order pada Pukul 12.00 - 13.00 untuk mendapatakan diskon 20%");
        request.setToken("dsuwPnxNpHZewfc8w-_Heo:APA91bHS92pwASe9FSdaUi3SHlJqiFOeAnjPUUKjSRCAOtRXQTUCHDOy7JpJFOU9Cn3hSmtMpPOxhxcUtVcGWp_1AjT73YMe6ktfISQO7gqI89270Gi3hacTKRzg99ozngP7fL7ZtiSj");
        fcmService.sendMessageToToken(request);

        System.out.println("promotion send to fcm");
    }
}
