import React from 'react';
import {
	  AppRegistry,
	  Text,
	  View,
	  Button,
	  Image,
	  TouchableOpacity
} from 'react-native';
import { StackNavigator, TabNavigator } from 'react-navigation';
import { tabHolder } from './Views/Login/tabholder.js';
import { ExploreView } from './Views/Explore/exploreView.js';
import { RegisterView } from './Views/Registration/registrationView.js';
import styles from './styles.js';


const Header = props => (
	<View style={{backgroundColor: 'transparent'}}>
	</View>
);

class HomeScreen extends React.Component {
	  static navigationOptions = {
		      title: 'Home',
		      header: (props) => <Header {...props}/>,
		    };
	  render() {

		const { navigate } = this.props.navigation; 
		      return(
			<Image source = {require('./Assets/l4040003cd_-_dock-in-fog.jpg')}
			      style={styles.container}>
			<View>
		  	<TouchableOpacity 
		  		onPress={() => navigate('Holder')}
			        style={styles.loginStyle}>
				<Text style={styles.textStyle}>Login</Text>
			</TouchableOpacity>
			      </View>
			<View>      
		  	<TouchableOpacity 
		  		onPress={() => navigate('Explore')}
			      	style={styles.exploreStyle}>
				<Text style={styles.textStyle}>Explore</Text> 
			</TouchableOpacity>
			</View>
			</Image>
		);
	 }
}


const  ExploringTheUnconscious =StackNavigator({
	  Home: { screen: HomeScreen },
	  Holder: { screen: tabHolder },
	  Explore: { screen: ExploreView },
});

AppRegistry.registerComponent('ExploringTheUnconscious', () => ExploringTheUnconscious);


