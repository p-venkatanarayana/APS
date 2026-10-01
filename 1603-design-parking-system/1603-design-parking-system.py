class ParkingSystem:
    __slots__ = ['space']
    def __init__(self, big: int, medium: int, small: int):
        self.space = {
            1 : big,
            2 : medium,
            3 : small
        }

    def addCar(self, carType: int) -> bool:
        if self.space[carType] > 0: 
            self.space[carType] += -1
            return True
        else: 
            return False