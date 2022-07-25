package web.service;

import org.springframework.stereotype.Service;
import web.DAO.CarsDAO;
import web.Model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    public final CarsDAO carsDAO;

    public CarServiceImp(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }


    @Override
    public List<Car> listCarsService() {
        List<Car> car =
                carsDAO.listCars();
        return car;
    }

    @Override
    public List<Car> countsCarsIdService(Integer count) {
        if (count == null || count >= 5) {
          return  carsDAO.listCars();
        } else {
        }return  carsDAO.countsCarsId(count);
    }

}
