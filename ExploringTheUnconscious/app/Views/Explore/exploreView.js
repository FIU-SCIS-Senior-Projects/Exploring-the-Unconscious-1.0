import React, { Componenet } from 'react';
import{
	View, 
	Text,
	Image,
} from 'react-native';

import { StackNavigator } from 'react-navigation';
import styles from './styles.js';


export class ExploreView extends React.Component {
	render() {
		return(
			<Image source={require('../../Assets/airbnb1.jpg')}
			style={styles.container}>
			<View style={styles.overlay}>
			<Text style={styles.title}> Under Construction  </Text>
			<Text style ={styles.blurb}> The current page is still in developement for version 2</Text>
			</View>
			</Image>
		)
	}
}
