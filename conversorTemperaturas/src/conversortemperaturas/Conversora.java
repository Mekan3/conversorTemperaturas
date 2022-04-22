package conversortemperaturas;

public class Conversora {

    public Conversora() {
    }
    
    double celsiusToFahrenheit(double ctemp){
        double ftemp;
        ftemp = (9*ctemp) / 5 + 32;
        return ftemp;
    }
    
    double celsiusToKelvin(double ctemp){
        double ktemp;
        ktemp = ctemp + 273.15;
        return ktemp;
    }
    
    double fahrenheitToCelsius(double ftemp){
        double ctemp;
        ctemp = (ftemp-32) * 5/9;
        return ctemp;
    }
    
    double fahrenheitToKelvin(double ftemp){
        double ktemp;
        ktemp = (ftemp-32) * 5/9 + 273.15;
        return ktemp;
    }
    
    double kelvinToCelsius(double ktemp){
        double ctemp;
        ctemp = ktemp - 273.15;
        return ctemp;
    }
    
    double kelvinToFahrenheit(double ktemp){
        double ftemp;
        ftemp = (ktemp- 273.15) * 5/9 + 32;
        return ftemp;
    }
    
}
