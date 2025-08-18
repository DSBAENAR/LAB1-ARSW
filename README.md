# LAB1-ARSW

## Parte I - Introducción a Hilos en Java

1. De acuerdo con lo revisado en las lecturas, complete las clases CountThread, para que las mismas definan el ciclo de vida de un hilo que imprima por pantalla los números entre A y B.

``` java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hcadavid
 */
public class CountThread extends Thread {
    private int initial;
    private int end;

    public CountThread(int initial, int end) {
        this.initial = initial;
        this.end = end;
    }

    @Override
    public void run() {
        increment();
    }

    public void increment() {
        for (int i = initial; i <= end; i++) {
            System.out.println("Counting: " + i);
        }
    }
    

    
}
```
2. Complete el método main de la clase CountMainThreads para que:
* Cree 3 hilos de tipo CountThread, asignándole al primero el intervalo [0..99], al segundo [99..199], y al tercero [200..299].
* Inicie los tres hilos con 'start()'.
``` java
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread ct1 = new CountThread(0, 99);
        CountThread ct2 = new CountThread(99, 199);
        CountThread ct3 = new CountThread(200, 299);
        
        ct1.start();
        ct2.start();
        ct3.start();
        
        
        System.out.println("Counting completed.");
    }
    
}
```
Ejecute y revise la salida por pantalla.

```bash
Counting: 0
Counting: 1
Counting: 2
Counting: 200
Counting: 201
Counting: 99
Counting: 100
Counting: 101
Counting: 202
Counting: 203
Counting: 204
Counting: 205
Counting: 206
Counting: 3
Counting: 4
Counting: 5
Counting: 102
Counting: 103
Counting: 104
Counting: 105
Counting: 6
Counting: 7
Counting: 8
Counting: 207
Counting: 208
Counting: 209
Counting: 210
Counting: 211
Counting: 212
Counting: 213
Counting: 9
Counting: 10
Counting: 11
Counting: 12
Counting: 13
Counting: 106
Counting: 107
Counting: 108
Counting: 109
Counting: 110
Counting: 111
Counting: 112
Counting: 113
Counting: 114
Counting: 115
Counting: 116
Counting: 117
Counting: 118
Counting: 119
Counting: 120
Counting: 14
Counting: 15
Counting: 16
Counting: 214
Counting: 215
Counting: 216
Counting: 217
Counting: 218
Counting: 219
Counting: 220
Counting: 17
Counting: 18
Counting: 19
Counting: 20
Counting: 21
Counting: 22
Counting: 23
Counting: 24
Counting: 25
Counting: 26
Counting: 27
Counting: 28
Counting: 29
Counting: 30
Counting: 31
Counting: 32
Counting: 33
Counting: 34
Counting: 35
Counting: 36
Counting: 37
Counting: 38
Counting: 39
Counting: 40
Counting: 41
Counting: 42
Counting: 43
Counting: 44
Counting: 45
Counting: 46
Counting: 47
Counting: 48
Counting: 49
Counting: 50
Counting: 51
Counting: 52
Counting: 53
Counting: 54
Counting: 55
Counting: 56
Counting: 57
Counting: 58
Counting: 59
Counting: 60
Counting: 61
Counting: 62
Counting: 63
Counting: 64
Counting: 65
Counting: 66
Counting: 67
Counting: 68
Counting: 69
Counting: 121
Counting: 70
Counting: 71
Counting: 221
Counting: 222
Counting: 223
Counting: 224
Counting: 225
Counting: 226
Counting: 227
Counting: 228
Counting: 72
Counting: 122
Counting: 123
Counting: 124
Counting: 125
Counting: 126
Counting: 127
Counting: 73
Counting: 74
Counting: 75
Counting: 229
Counting: 230
Counting: 231
Counting: 232
Counting: 233
Counting: 234
Counting: 235
Counting: 236
Counting: 76
Counting: 128
Counting: 129
Counting: 77
Counting: 78
Counting: 79
Counting: 80
Counting: 81
Counting: 82
Counting: 83
Counting: 84
Counting: 85
Counting: 86
Counting: 87
Counting: 88
Counting: 237
Counting: 238
Counting: 239
Counting: 240
Counting: 241
Counting: 242
Counting: 243
Counting: 89
Counting: 90
Counting: 91
Counting: 92
Counting: 93
Counting: 94
Counting: 130
Counting: 131
Counting: 132
Counting: 133
Counting: 134
Counting: 135
Counting: 136
Counting: 137
Counting: 138
Counting: 139
Counting: 140
Counting: 95
Counting: 244
Counting: 245
Counting: 246
Counting: 247
Counting: 248
Counting: 249
Counting: 96
Counting: 97
Counting: 98
Counting: 99
Counting: 141
Counting: 142
Counting: 143
Counting: 144
Counting: 145
Counting: 250
Counting: 251
Counting: 252
Counting: 253
Counting: 254
Counting: 255
Counting: 256
Counting: 257
Counting: 258
Counting: 146
Counting: 259
Counting: 260
Counting: 261
Counting: 262
Counting: 263
Counting: 264
Counting: 265
Counting: 147
Counting: 266
Counting: 267
Counting: 148
Counting: 149
Counting: 150
Counting: 151
Counting: 152
Counting: 153
Counting: 154
Counting: 155
Counting: 156
Counting: 268
Counting: 269
Counting: 270
Counting: 271
Counting: 272
Counting: 273
Counting: 274
Counting: 275
Counting: 276
Counting: 277
Counting: 278
Counting: 279
Counting: 280
Counting: 157
Counting: 281
Counting: 158
Counting: 159
Counting: 282
Counting: 283
Counting: 284
Counting: 285
Counting: 286
Counting: 160
Counting: 161
Counting: 162
Counting: 163
Counting: 287
Counting: 288
Counting: 164
Counting: 165
Counting: 166
Counting: 167
Counting: 168
Counting: 169
Counting: 289
Counting: 290
Counting: 170
Counting: 171
Counting: 172
Counting: 291
Counting: 292
Counting: 293
Counting: 294
Counting: 295
Counting: 173
Counting: 174
Counting: 175
Counting: 176
Counting: 177
Counting: 178
Counting: 296
Counting: 297
Counting: 298
Counting: 179
Counting: 180
Counting: 181
Counting: 182
Counting: 183
Counting: 184
Counting: 185
Counting: 186
Counting: 187
Counting: 188
Counting: 189
Counting: 190
Counting: 191
Counting: 192
Counting: 193
Counting: 194
Counting: 195
Counting: 196
Counting: 197
Counting: 198
Counting: 299
Counting: 199
```
Cambie el incio con 'start()' por 'run()'. Cómo cambia la salida?, por qué?.

``` java
public class CountThreadsMain {
    
    public static void main(String a[]){
        CountThread ct1 = new CountThread(0, 99);
        CountThread ct2 = new CountThread(99, 199);
        CountThread ct3 = new CountThread(200, 299);
        
        ct1.run();
        ct2.run();
        ct3.run();
        
        
        System.out.println("Counting completed.");
    }
    
}
```

### Salida

``` bash
Counting: 0
Counting: 1
Counting: 2
Counting: 3
Counting: 4
Counting: 5
Counting: 6
Counting: 7
Counting: 8
Counting: 9
Counting: 10
Counting: 11
Counting: 12
Counting: 13
Counting: 14
Counting: 15
Counting: 16
Counting: 17
Counting: 18
Counting: 19
Counting: 20
Counting: 21
Counting: 22
Counting: 23
Counting: 24
Counting: 25
Counting: 26
Counting: 27
Counting: 28
Counting: 29
Counting: 30
Counting: 31
Counting: 32
Counting: 33
Counting: 34
Counting: 35
Counting: 36
Counting: 37
Counting: 38
Counting: 39
Counting: 40
Counting: 41
Counting: 42
Counting: 43
Counting: 44
Counting: 45
Counting: 46
Counting: 47
Counting: 48
Counting: 49
Counting: 50
Counting: 51
Counting: 52
Counting: 53
Counting: 54
Counting: 55
Counting: 56
Counting: 57
Counting: 58
Counting: 59
Counting: 60
Counting: 61
Counting: 62
Counting: 63
Counting: 64
Counting: 65
Counting: 66
Counting: 67
Counting: 68
Counting: 69
Counting: 70
Counting: 71
Counting: 72
Counting: 73
Counting: 74
Counting: 75
Counting: 76
Counting: 77
Counting: 78
Counting: 79
Counting: 80
Counting: 81
Counting: 82
Counting: 83
Counting: 84
Counting: 85
Counting: 86
Counting: 87
Counting: 88
Counting: 89
Counting: 90
Counting: 91
Counting: 92
Counting: 93
Counting: 94
Counting: 95
Counting: 96
Counting: 97
Counting: 98
Counting: 99
Counting: 99
Counting: 100
Counting: 101
Counting: 102
Counting: 103
Counting: 104
Counting: 105
Counting: 106
Counting: 107
Counting: 108
Counting: 109
Counting: 110
Counting: 111
Counting: 112
Counting: 113
Counting: 114
Counting: 115
Counting: 116
Counting: 117
Counting: 118
Counting: 119
Counting: 120
Counting: 121
Counting: 122
Counting: 123
Counting: 124
Counting: 125
Counting: 126
Counting: 127
Counting: 128
Counting: 129
Counting: 130
Counting: 131
Counting: 132
Counting: 133
Counting: 134
Counting: 135
Counting: 136
Counting: 137
Counting: 138
Counting: 139
Counting: 140
Counting: 141
Counting: 142
Counting: 143
Counting: 144
Counting: 145
Counting: 146
Counting: 147
Counting: 148
Counting: 149
Counting: 150
Counting: 151
Counting: 152
Counting: 153
Counting: 154
Counting: 155
Counting: 156
Counting: 157
Counting: 158
Counting: 159
Counting: 160
Counting: 161
Counting: 162
Counting: 163
Counting: 164
Counting: 165
Counting: 166
Counting: 167
Counting: 168
Counting: 169
Counting: 170
Counting: 171
Counting: 172
Counting: 173
Counting: 174
Counting: 175
Counting: 176
Counting: 177
Counting: 178
Counting: 179
Counting: 180
Counting: 181
Counting: 182
Counting: 183
Counting: 184
Counting: 185
Counting: 186
Counting: 187
Counting: 188
Counting: 189
Counting: 190
Counting: 191
Counting: 192
Counting: 193
Counting: 194
Counting: 195
Counting: 196
Counting: 197
Counting: 198
Counting: 199
Counting: 200
Counting: 201
Counting: 202
Counting: 203
Counting: 204
Counting: 205
Counting: 206
Counting: 207
Counting: 208
Counting: 209
Counting: 210
Counting: 211
Counting: 212
Counting: 213
Counting: 214
Counting: 215
Counting: 216
Counting: 217
Counting: 218
Counting: 219
Counting: 220
Counting: 221
Counting: 222
Counting: 223
Counting: 224
Counting: 225
Counting: 226
Counting: 227
Counting: 228
Counting: 229
Counting: 230
Counting: 231
Counting: 232
Counting: 233
Counting: 234
Counting: 235
Counting: 236
Counting: 237
Counting: 238
Counting: 239
Counting: 240
Counting: 241
Counting: 242
Counting: 243
Counting: 244
Counting: 245
Counting: 246
Counting: 247
Counting: 248
Counting: 249
Counting: 250
Counting: 251
Counting: 252
Counting: 253
Counting: 254
Counting: 255
Counting: 256
Counting: 257
Counting: 258
Counting: 259
Counting: 260
Counting: 261
Counting: 262
Counting: 263
Counting: 264
Counting: 265
Counting: 266
Counting: 267
Counting: 268
Counting: 269
Counting: 270
Counting: 271
Counting: 272
Counting: 273
Counting: 274
Counting: 275
Counting: 276
Counting: 277
Counting: 278
Counting: 279
Counting: 280
Counting: 281
Counting: 282
Counting: 283
Counting: 284
Counting: 285
Counting: 286
Counting: 287
Counting: 288
Counting: 289
Counting: 290
Counting: 291
Counting: 292
Counting: 293
Counting: 294
Counting: 295
Counting: 296
Counting: 297
Counting: 298
Counting: 299
Counting completed.
```
En este caso la salida cambia por orden de ejecución, el método start crea un nuevo hilo mientras que el método run se ejecuta en el hilo recién creado, no se puede invocar más de una vez, de lo contrario se lanza java.lang.IllegalStateException, mientras que con el método start es posible realizar múltiples invocaciones.

