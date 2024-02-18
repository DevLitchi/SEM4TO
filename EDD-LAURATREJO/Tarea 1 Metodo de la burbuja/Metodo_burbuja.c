#include <stdlib.h> 
#include <conio.h>
#include <stdio.h>

int main(){
    int num [] = {9,2,3,4,5,6,1,0,7,8}; //se declara el arreglo con los 10 digitos
    int l,v,cambio; //se declaran las variables para el ordenamiento en este caso l=i, v=j,cambio=orden
    //l=lugar, v=validar, cambio=ordenar
    int opcion = 0; // Iniciar opcion para el switch
    printf("Bienvenido");
    printf("\nQue desea hacer?\n[1]. Ordenar numeros\n[2]. Salir\n");
    scanf("%i", &opcion);
    switch (opcion) {
        case 1:
            for (l=0;l<10;l++) { //en este for lo que hacemos es avanzar de lugar del arreglo del inicio hasta el final
                for(v=0;v<10;v++) { //En este fot aparte de avanzar de manera creciente validamos los numeros y comparamos
                    if(num[v]>num[v+1]) { //Dentro de un if ponemos la validacion a realizar, si el numero donde estamos es matos a el numero siguiente
                        cambio = num[v]; // entoncess cambio = num[v] lo que quiere decir que cambio es el numero de la posicion donde estamos para asi
                        num[v] = num[v+1]; // el numero donde estamos es igual al siguiente para despues
                        num[v+1] = cambio; //El que era el siguiente numero ahora es el numero en el que soliamos estar
                    }
                }
            }
            //Mostrar el orden
            printf("Orden A>Z:\n");
            for (l = 0; l <10; l++) {
                printf("%d",num[l]);
            }
            break;
    
        case 2:
            break;
    }

    getch();
    return 0;
}