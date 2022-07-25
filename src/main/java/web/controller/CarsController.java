package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import web.Model.Car;
import web.service.CarServiceImp;

import java.util.List;

// примере  не определено GET, PUT, POST и так далее, потому что @RequestMapping соответствует всем HTTP операциям по умолчанию. @RequestMapping(method=GET) уточняет это соответствие.

@Controller// аннотация будет отсканирована @ComponentScan("web")
@RequestMapping()
//Аннотация @RequestMapping гарантирует, что HTTP запросы к /cars приведут к выполнению метода greeting().
public class CarsController {

    public final CarServiceImp carServiceImp;
    public final CarsDAO carsDAO;


    public CarsController(CarServiceImp carServiceImp, CarsDAO carsDAO) {
        this.carServiceImp = carServiceImp;
        this.carsDAO = carsDAO;
    }


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> cars = carServiceImp.countsCarsIdService(count);
        model.addAttribute("cars",cars);

        return "cars";
    }


}

