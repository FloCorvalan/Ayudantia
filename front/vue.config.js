module.exports = {
  transpileDependencies: [
    'vuetify'
  ],
  output: {
    path: path.resolve(__dirname, '../dist'),
    filename: 'build.js',
    publicPath: './static'
}
}
