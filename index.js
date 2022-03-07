import {
  AppRegistry
} from 'react-native';
import { name as appName } from './app.json';
import HelloWorld from './app'

AppRegistry.registerComponent(
  appName,
  () => HelloWorld
);
