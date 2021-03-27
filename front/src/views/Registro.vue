<template>
  <v-container fluid ma-0 pa-0 fill-height class="black">
    <v-row align="center" justify="center">
      <v-card class="pa-lg-4 mx-lg-16" width="300">
        <v-form v-model="valid">
          <v-card-title class="justify-center"> Calculadora suma </v-card-title>

          <v-text-field
            v-model="nombre"
            :rules="numberRules"
            label="Nombre"
          ></v-text-field>

          <v-text-field
            v-model="operando1"
            :rules="numberRules"
            label="Primer operando"
          ></v-text-field>

          <v-text-field
            v-model="operando2"
            :rules="numberRules"
            label="Segundo operando"
          ></v-text-field>

          <v-text-field v-model="resultado" label="Resultado" disabled>
          </v-text-field>

          <v-btn
            class="mt-8"
            justify="center"
            width="80%"
            color="primary"
            v-on:click="calcularSuma"
            :style="{ left: '50%', transform: 'translateX(-50%)' }"
          >
            Calcular suma
          </v-btn>
        </v-form>
      </v-card>
    </v-row>
  </v-container>
</template>

<script>
import axios from "axios";
export default {
  data: () => ({
    valid: false,
    nombre: null,
    operando1: null,
    operando2: null,
    numberRules: [],
    resultado: null,
  }),
  methods: {
    calcularSuma: function () {
      axios
        .post("http://backend:30000/registro", {
          operando1: this.operando1,
          operando2: this.operando2,
          nombre: this.nombre,
        })
        .then((response) => {
          this.resultado = response.data.resultado;
          console.log(this.resultado);
        });
      
    },
    save(date) {
      this.$refs.menu.save(date);
    },
  },
};
</script>