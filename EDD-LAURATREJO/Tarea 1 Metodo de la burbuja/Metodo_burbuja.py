"""
Este programa implementa el algoritmo de ordenamiento por el método de la burbuja.
Ordena una lista de números de forma ascendente.
"""

print("Ordenamiento por metodo burbuja")

numeros = [1,2,4,5,3,6,8,7,9,0] #Iniciamos la lista con los datos que deseamos ordenar
for i in range(len(numeros)-1): #La función len(numeros) devuelve la longitud de la lista "numeros". Restamos 1 para asegurarnos de que no se realicen comparaciones innecesarias en la última iteración.

    for j in range(len(numeros)-1):#se crea otro bucle for que también se ejecuta len(numeros)-1 veces. Esto se hace para comparar cada elemento de la lista con su siguiente elemento.
        if numeros[j] > numeros[j+1]:
            numeros[j], numeros[j+1] = numeros[j+1], numeros[j]
    #Dentro del bucle anidado, se compara si el elemento actual numeros[j] es mayor que el siguiente elemento numeros[j+1]. Si es así, se intercambian los elementos utilizando una asignación múltiple. 
    #Esto asegura que los elementos más grandes "suban" hacia el final de la lista.

print(numeros)
