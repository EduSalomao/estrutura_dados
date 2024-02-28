class StaticStack:
    def __init__(self) -> None:
        self.__pointer = -1
        self.__DataArray = []
 
    def isEmpty(self) -> bool:
        return self.__pointer == -1
  
    def showData(self):
        if self.isEmpty():
            print("Stack is empty!")
        else:
            print("All stack data: ")
            for i, item in enumerate(self.__DataArray):
                if i > self.__pointer:
                    break
                print(item)

    def Append(self, obj):
        self.__pointer += 1
        if 0 <= self.__pointer < len(self.__DataArray):
            self.__DataArray[self.__pointer] = obj
        self.__DataArray.append(obj)

    def Pop(self):
        if not self.isEmpty():
            self.__pointer -= 1

    def Top(self):
        if not self.isEmpty():
            print(self.__DataArray[self.__pointer])


 