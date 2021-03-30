module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  devServer: {
    proxy: 'http://backend-service.default.svc.cluster.local:4000'
  }
  },
}
