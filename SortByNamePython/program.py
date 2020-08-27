from collections import OrderedDict

class Parent:
    city_list = []
    def __init__(self):
        self.city_list = ['Paris','Cluj-Napoca','Timisoara','Berlin','Madrid','Londra','Barcelona','Venetia','Viena','Iasi']
    
    def met1(self):
       # print("met1 parentclass")
        return [city for city in self.city_list if len(city) % 2 == 1]
    def met2(self):
       # print("met2 parentclass")
        return [city for city in self.city_list if len(city) % 2 == 0]
    def met3(self):
        if type(self).__name__ != 'Child':
            return {'impar' : self.met1(), 'par' : self.met2()}
        else:
            b = Parent()
            b.city_list = self.city_list
            return {'impar' : b.met1(), 'par' : b.met2()}
    def met4(self):
        f = open('output.txt', 'a+')
        f.write(str(self.met1()) + '\n')
        f.write(str(self.met2()) + '\n')
        f.write(str(self.met3()) + '\n')
        f.close()
        
class Child(Parent):
    def met1(self):
       # print("met1 child class")
        self.city_list.sort()
        return self.city_list
    def met2(self):
       # print("met2 child class")
        for i in range(len(self.city_list)):
            self.city_list[i] = "".join(set(self.city_list[i]))
        return self.city_list
        
        
