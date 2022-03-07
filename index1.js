import {
  AppRegistry
} from 'react-native';
import { name as appName } from './app.json';
import HelloWorld1 from './app1'

AppRegistry.registerComponent(
  appName,
  () => HelloWorld1
);
