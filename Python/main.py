from car import Car
from account import Account
from UberX import UberX

if __name__ == "__main__":
    car  = Car("AMD123", Account("Andres Herrera", "AND1235"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("BTC123", Account("Juan Perez", "AXS123"), "AUDI", "A3")
    uberX.passengers = 3
    print(vars(uberX))
