package model.entities.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();//pegar o valor em milisegundos
        long t2 = carRental.getFinish().getTime();//pegar o valor em milisegundos
        // (t2 - t1) = achar a diferença em milisegundos. /1000 = converte para segundos.
        // /60 = converte para minutos. /60 = converte para hora.
        double hours = (double)(t2 - t1) / 1000 / 60 / 60;

        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);//arredonda o numero de horas para cima
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
