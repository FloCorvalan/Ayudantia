module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    proxy: {
      "/": {
        target: "http://backend-service.default.svc.cluster.local:30000",
        ws: true,
        changeOrigin: true
      }
    }
  },
}
