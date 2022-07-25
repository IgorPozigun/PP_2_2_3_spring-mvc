package web.DAO;

import web.Model.Car;

import java.util.List;

public interface CarsDAO {

    List<Car> listCars();
    List<Car> countsCarsId(Integer count);
}
