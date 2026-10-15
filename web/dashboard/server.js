require('http')
  .createServer((req, res) => res.end('dashboard placeholder'))
  .listen(3000, () => console.log('dashboard on :3000'));
