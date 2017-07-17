import {StyleSheet} from 'react-native'

const styles = StyleSheet.create({
	container: {
		flex: 1,
		height: null,
		width: null,
		backgroundColor: 'rgba(0,0,0,0)',
	},
	overlay: {
		flex: 1,
		backgroundColor: 'black',
		opacity: 0.5,
	},
	title: {
		top: 200,
		color: 'white',
		justifyContent: 'center',
		alignSelf: 'center',
		textAlign: 'center',
		fontSize: 30,
	},
	blurb: {
		top: 200,
		color: 'white',
		textAlign: 'center',
	},
});

export default styles;
