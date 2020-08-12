'''
Created on 17-Feb-2020

@author: VISHAL SHINDE
'''
from ctypes.test.test_pickling import name
class ABC(object):
    count=0
    name=""
    
    def __init__(self, count, name):
        self.count = count
        self.name = name

    def get_count(self):
        return self.__count


    def get_name(self):
        return self.__name


    def set_count(self, value):
        self.__count = value


    def set_name(self, value):
        self.__name = value


    def del_count(self):
        del self.__count


    def del_name(self):
        del self.__name

    count = property(get_count, set_count, del_count, "count's docstring")
    name = property(get_name, set_name, del_name, "name's docstring")
    v1 = name
    def display(self):
        print(f"count is {self.count} and name is {self.name}")
        print(name)

if __name__ == '__main__':
    a= ABC(10, "Vishal")
    #a.del_count()
    print(type(ABC.v1))
    a.display()