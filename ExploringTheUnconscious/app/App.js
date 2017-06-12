import React from 'react';
import {
	  AppRegistry,
	  Text,
	  View,
	  Button,
	  Image,
} from 'react-native';
import { StackNavigator } from 'react-navigation';
import { LoginView } from './Views/loginView.js';
import styles from './styles.js';
class HomeScreen extends React.Component {
	  static navigationOptions = {
		      title: 'Welcome',
		    };
	  render() {

		const { navigate } = this.props.navigation; 
		      return(
			<Image source = {require('./Assets/l4040003cd_-_dock-in-fog.jpg')}
			      style={styles.container}>
			<View>
		  	<Button
		  		onPress={() => navigate('Login')}
		  		title="Login" />
			</View>
			</Image>
		);
	 }
}

class ChatScreen extends React.Component {
	static navigationOptions = ({navigation }) => ({ 
		title: `Chat with ${navigation.state.params.user}`,
	});
	render() {
		const { params } = this.props.navigation.state;
		return (
			<View>
				<Text>Chat with {params.user}</Text>
			</View>
		);
	}
}

const  ExploringTheUnconscious =StackNavigator({
	  Home: { screen: HomeScreen },
	  Chat: { screen: ChatScreen },
	  Login: { screen: LoginView },

});

AppRegistry.registerComponent('ExploringTheUnconscious', () => ExploringTheUnconscious);


